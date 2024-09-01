package br.com.hotel.controle;

import br.com.hotel.hospedes.Hospede;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Hospede> listaHospede = new ArrayList <>();

    public void cadastrarHospede (Hospede hospede) {
             listaHospede.add(hospede);
    }

    public String listarHospede() {
        String lista = "";
        for (Hospede h : listaHospede) {
            System.out.println("CPF: " + h.getCpf());
            System.out.println("Nome: " + h.getNome());
            System.out.println("E-mail: " + h.getEmail());
            System.out.println("Telefone: " + h.getTelefone());
            System.out.println("///////////////////////////");
        }
        return lista;
    }

    public Hospede getHospede(String cpf) {
        for (Hospede h : listaHospede) {
            if (h.getCpf() == cpf) {
                return h;
            }
        }
        return null;
    }

    public void excluiHospede(Hospede hospede) {
        listaHospede.remove(hospede);
    }
}
