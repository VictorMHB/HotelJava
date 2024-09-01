package br.com.hotel.controle;

import br.com.hotel.hospedes.Hospede;

import java.util.ArrayList;
import java.util.Objects;

public class Controle {
    private ArrayList<Hospede> listaHospedes;

    public Controle() {
        listaHospedes = new ArrayList<>(100);
    }

    public void cadastrarHospede (String nome, String cpf, String email, String telefone) {
        listaHospedes.add(new Hospede(nome, cpf, email, telefone));
    }

    public String listarHospede() {
        String saida = "Lista dos hóspedes que estão cadastrados:\n";

        for (Hospede hospedeAux : listaHospedes) {
            saida += "CPF: " + hospedeAux.getCpf() + "\n";
            saida += "Nome: " + hospedeAux.getNome() + "\n";
            saida += "E-mail: " + hospedeAux.getEmail() + "\n";
            saida += "Telefone: " + hospedeAux.getTelefone() + "\n";
            saida += "---------------\n";
        }
        return saida;
    }

    public String buscarHospede(String cpf) {
        String saida = "---------------\n";

        for (Hospede hospedeAux : listaHospedes) {
            if (hospedeAux.getCpf() == cpf) {
                saida += "Nome: " + hospedeAux.getNome() + "\n";
                saida += "E-mail: " + hospedeAux.getEmail() + "\n";
                saida += "Telefone: " + hospedeAux.getTelefone() + "\n";
                saida += "---------------\n";
            }
        }
        return saida;
    }

    public void excluiHospede(String cpf) {
        Hospede hospedeAux;

        for (int i = 0; i < listaHospedes.size(); i++) {
            hospedeAux = listaHospedes.get(i);
            if (hospedeAux.getCpf().equals(cpf)) {
                listaHospedes.remove(hospedeAux);
            }
        }
    }

}
