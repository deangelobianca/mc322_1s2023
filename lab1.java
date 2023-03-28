
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;

    // Cnstrutor 
    public Veiculo (String placa, String marca, Sring modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters e Setters
    public String getPlaca () {
        return placa;
    }

    public void setPlaca( String placa ) {
        this.placa = placa;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca( String marca ) {
        this.marca = marca;
    }

      public String getModelo () {
        return modelo;
    }

    public void setModelo( String modelo ) {
        this.modelo = modelo;
    }

}


public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private String endereco;

    // Construtor 
    public Cliente (String nome, String cpf, Sring dataNascimento, int idade, String endereco){
        this.nome = nome;
        this.cpf = marca;
        this.dataNascimento = modelo;
        this.idade = modelo;
        this.endereco = modelo;
    }

    //Getters e Setters
    public String getNome () {
        return placa;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getcpf () {
        return cpf;
    }

    public void setcpf ( String cpf ) {
        this.cpf = cpf;
    }

      public String getdataNascimento () {
        return dataNascimento;
    }

    public void setdataNascimento( String dataNascimento ) {
        this.dataNascimento = dataNascimento;
    }

    public int getidade () {
        return idade;
    }

     public void setidade( int idade ) {
        this.idade = idade;
    }

    public String getEndereco () {
        return endereco ;
    }

    public void setEndereco ( String endereco ) {
        this.endereco = endereco ;
    }

}

public class Seguradora {
    private String nome ;
    private String telefone ;
    private String email ;
    private String endereco ;

    // Construtor
    public Seguradora ( String nome , String telefone , String email , String endereco ) {
        this.nome = nome ;
        this.telefone = telefone ;
        this.email = email ;
        this.endereco = endereco ;
    }

    // Getters e setters
    public String getNome () {
        return nome ;
    }

    public void setNome ( String nome ) {
        this.nome = nome ;
        }

    public String getTelefone () {
        return telefone ;
    }

    public void setTelefone ( String telefone ) {
        this.telefone = telefone ;
    }

    public String getEmail () {
        return email ;
    }

    public void setEmail ( String email ) {
        this.email = email ;
    }

    public String getEndereco () {
        return endereco ;
    }

    public void setEndereco ( String endereco ) {
        this.endereco = endereco ;
    }
    
}

public class Sinistro {
    private int id;
    private String data;
    private String endereco;

    // Cnstrutor 
    public Sinistro (int id, String marca, Sring modelo){
        this.id = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters e Setters
    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getData () {
        return data;
    }

    public void setData( String data ) {
        this.data = data;
    }

      public String getEndereco () {
        return endereco;
    }

    public void setEndereco( String endereco ) {
        this.endereco = endereco;
    }

}