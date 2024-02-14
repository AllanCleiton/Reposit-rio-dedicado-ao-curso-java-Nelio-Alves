package ex03;

public class Pessoa {
    private String nome;
    private byte idade;
    private float altura;

    

    public Pessoa(String nome, byte idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public byte getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }

    
}
