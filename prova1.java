package P3.PROVA;

public class prova1 {
    public class Empresa{
        //declaracoes
        private  String nome, cnpj, endereço, ceo;
        private Trabalhador[] trabalhadores = new Trabalhador[20];
        private int numeroFuncionarios;
        int qtd;

        //contrutor padrão
        public Empresa(){

        }
        //contrutores
        public Empresa(String nome, String cnpj, String endereço, String ceo, int numeroFuncionarios) {
            this.nome = nome;
            this.cnpj = cnpj;
            this.endereço = endereço;
            this.ceo = ceo;
            this.numeroFuncionarios = numeroFuncionarios;
        }
        //metodos


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public String getEndereço() {
            return endereço;
        }

        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }

        public String getCeo() {
            return ceo;
        }

        public void setCeo(String ceo) {
            this.ceo = ceo;
        }

        public int getNumeroFuncionarios() {
            return numeroFuncionarios;
        }

        public void setNumeroFuncionarios(int numeroFuncionarios) {
            this.numeroFuncionarios = numeroFuncionarios;
        }
        
        //3. (a) metdo contratar
        public void contratar(Trabalhador trabalhador){
            for (int i = 0; i <= trabalhadores.length-1; i++){
                if(trabalhadores[i] == null){
                    trabalhadores[i] = trabalhador;
                    qtd++;

                }
            }
        }


        // 3. (b) metodo trabalhar
        public void Trabalhar(Trabalhador trabalhador){
            for (int i = 0; i <= trabalhadores.length-1; i++){
                if (trabalhador.isFerias() == false){
                    trabalhador.setHorasTrabalhadas(trabalhador.getHorasTrabalhadas() + 8);

                } else System.out.println("Este trabalhador está de ferias!");
            }
        }

        public double calculcarPagamento(Trabalhador trabalhador){
            double pagamento = 0;
            for (int i = 0; i <= trabalhadores.length-1; i++){
                pagamento = pagamento + (trabalhador.getHorasTrabalhadas() * trabalhador.getValorHora());
            }
            return pagamento;
        }

    }
    //Classe Trabalhador
    public class Trabalhador {
        //declaracoes
        private String nome;
        private int idade, horasTrabalhadas;
        private double valorHora;
        private boolean ferias;

        //construtores
        public Trabalhador() {

        }

        public Trabalhador(String nome, int idade, int horasTrabalhadas, double valorHora, boolean ferias) {
            this.nome = nome;
            this.idade = idade;
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHora = valorHora;
            this.ferias = ferias;
        }

        //metodos
        //Getters e setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }

        public void setHorasTrabalhadas(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }

        public double getValorHora() {
            return valorHora;
        }

        public void setValorHora(double valorHora) {
            this.valorHora = valorHora;
        }

        public boolean isFerias() {
            return ferias;
        }

        public void setFerias(boolean ferias) {
            this.ferias = ferias;
        }

        // 3. (c) metodo ferias
        public void ferias(Trabalhador trabalhadores[], Trabalhador trabalhador) {
            for (int i = 0; i <= trabalhadores.length - 1; i++) {
                if (trabalhador.isFerias() == false) {
                    trabalhador.setFerias(true);
                }else trabalhador.setFerias(false);
            }
        }
    }
}
