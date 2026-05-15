package exercicios;


public class Principal {

    public static void main(String[] args) {

    PessoaFisica pessoa= new PessoaFisica();
    pessoa.setNome("Fulano de Tal");
    pessoa.setCpf("123.456.789-01");
    imprimir(pessoa);

    //############################
    System.out.println("");
    //############################

    PessoaJuridica empresa =new PessoaJuridica();
    empresa.setNome("Fulano de tal LTDA");
    empresa.setCnpj("33.134.369/0001-46");
    imprimir(empresa);

    }

    public static void imprimir(Pessoa pessoa) {
        if (pessoa instanceof PessoaJuridica) {
            System.out.println("Empresa: '"+pessoa.getNome() + "', CNPJ de número: " + pessoa.identificacao());
        }else{
            System.out.println("Cidadão: '"+pessoa.getNome() + "', CPF de número: " + pessoa.identificacao());
        }

    }

}
