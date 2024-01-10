import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void inserir(PessoaJuridica pessoa) {
        pessoas.add(pessoa);
    }

    public void alterar(PessoaJuridica pessoa) {
        // Implemente conforme necessário
    }

    public void excluir(int id) {
        // Implemente conforme necessário
    }

    public Pessoa obter(int id) {
        // Implemente conforme necessário
        return null;
    }

    public ArrayList<Pessoa> obterTodos() {
        return pessoas;
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(pessoas);
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoas = (ArrayList<Pessoa>) ois.readObject();
        }
    }
}


