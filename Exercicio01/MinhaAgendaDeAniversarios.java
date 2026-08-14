package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        setAniversariantes(new ArrayList<Aniversariante>());
    }

    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(aniversariante);
    }

    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<String>();

        for (Aniversariante aniversariante : aniversariantes) {
            DataAniversario data = aniversariante.getDataAniversario();

            if (data.equals(new DataAniversario(dia, mes))) {
                nomes.add(aniversariante.getNome());
            }
        }

        return nomes;
    }

    public void removerAniversariante(String nomeAniversariante) {
        for (int i = 0; i < aniversariantes.size(); i++) {
            if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Aniversariante> getAniversariantes() {
        return aniversariantes;
    }

    public void setAniversariantes(ArrayList<Aniversariante> aniversariantes) {
        this.aniversariantes = aniversariantes;
    }
}