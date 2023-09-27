package cartaoWEB;

public abstract class CartaoWeb {

    private String destinatario;
    private String remetente;

    public CartaoWeb(String destinatario, String remetente) {
        this.destinatario = destinatario;
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }



    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }



    public String getRemetente() {
        return remetente;
    }



    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }



    public String showMessage(){
        return getMessage();
    }

    public abstract String getMessage();
    
}