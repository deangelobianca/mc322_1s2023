package src.entitys;

import src.entitys.autenticacao.AutenticacaoUsuario;
import src.entitys.emprestimo.Emprestimo;
import src.entitys.emprestimo.Reserva;
import src.entitys.obras.Obra;
import src.entitys.Acervo;
import src.entitys.Usuario;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    private Acervo acervo;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;
    private List<Reserva> reservas;

    public Biblioteca(Acervo acervo, List<Usuario> usuarios, List<Emprestimo> emprestimos, List<Reserva> reservas) {
        this.acervo = acervo;
        this.usuarios = usuarios;
        this.emprestimos = emprestimos;
        this.reservas = reservas;
    }

    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (this.getUsuarios().contains(usuario)) { return; }

        this.getUsuarios().add(usuario);
    }

    public boolean gerarReserva(Usuario usuario, Obra obra, Date dataReserva, Integer validade) {
        if (obra.isReservado()) { return false; }

        Reserva reserva = new Reserva(dataReserva, validade, usuario, obra);
        obra.setReservado(true);
        this.getReservas().add(reserva);

        return true;
    }

    public boolean entrarUsuario(String ra, String senha) {

			Usuario usuario = new Usuario(ra, "bypass", "bypass", senha, new ArryaList<>());
			
        AutenticacaoUsuario autenticacaoUsuario = new AutenticacaoUsuario(usuario);

        return autenticacaoUsuario.autenticarUsuario(senha);
    }

    public boolean adicionarObra(Obra obra) {
        if (this.acervo.getObras().contains(obra)) { return false; }

        return this.acervo.getObras().add(obra);
    }

    public boolean gerarEmprestimo(Emprestimo emprestimo) {
        return this.getEmprestimos().add(emprestimo);
    }

    public List<Emprestimo> getEmprestimosUsuario(Usuario usuario) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getUsuario() == usuario).toList();
    }

    public List<String> procurarObras(String subString) {
        List<String> procurados = new ArrayList<>();
        List<String> listaTitulos = new ArrayList<>();
    
        for (Obra obra : acervo.getObras()) {
            listaTitulos.add(obra.getTitulo());
        }
    
        for (String title : listaTitulos) {
            if (title.toLowerCase().contains(subString.toLowerCase())) {
                procurados.add(title);
            }
        }
    
        return procurados;
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "acervo=" + acervo +
                ", usuarios=" + usuarios +
                ", emprestimos=" + emprestimos +
                ", reservas=" + reservas +
                '}';
    }
}
