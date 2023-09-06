package aula4_5_setembro.ex1;

public class Candidatos {

private String nome;
private int teorica;
private int pratica;
private int entrevista;

public Candidatos(){
nome = "";
teorica = 0;
pratica = 0;
entrevista = 0;
}

public Candidatos(String nome){
setNome(nome);
this.teorica = 0;
this.pratica = 0;
this.entrevista = 0;
}

public Candidatos(String nome, int teorica, int pratica, int entrevista){
setNome(nome);
setEntrevista(entrevista);
setPratica(pratica);
setTeorica(teorica);
}

public void setTeorica(int teorica){
if(isValid(teorica)){
this.teorica = teorica;
}else{
this.teorica = 0;
}
}

public void setNome(String nome){
if(!nome.isEmpty()){
this.nome = nome.toUpperCase();
}else{
this.nome = "";
}
}

public void setPratica(int pratica){
this.pratica = isValid(pratica) ? pratica : 0;
}

public void setEntrevista(int entrevista){
this.entrevista = isValid(entrevista) ? entrevista : 0;
}

public String getNome() {
return nome;
}

public int getTeorica() {
return teorica;
}

public int getPratica() {
return pratica;
}

public int getEntrevista() {
return entrevista;
}

public double getTotal(){
return (this.teorica*0.3) + (this.pratica*0.4) + (this.entrevista*0.3);
}

private boolean isValid(int mark){
return mark >= 0 && mark <= 100;
}
}