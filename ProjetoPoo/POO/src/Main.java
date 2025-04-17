import java.sql.SQLInput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu = 0;
        while (opcaoMenu != 9){
            System.out.println("⊹₊｡ꕤ˚₊⊹ MENU ⊹₊｡ꕤ˚₊⊹");
            System.out.println("(1) Login");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();

            if (opcaoMenu == 1){
                //login();
                menuAdm();
            }
        }
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("E-mail: ");
        String email = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        /*if TIPO SQL){
            menuAdm();
        } else if (email instanceof Vendedor && senha instanceof VendedorDAO) {
            menuVendedor();
        }*/
    }

    public static void menuAdm(){
        Scanner sc = new Scanner(System.in);
        int opcaoAdm = 0;
        while (opcaoAdm != 9){
            System.out.println("⊹₊｡ꕤ˚₊⊹ MENU ADM ⊹₊｡ꕤ˚₊⊹");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Listar");
            System.out.println("(3) Fechamento do dia");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoAdm = sc.nextInt();

            if (opcaoAdm == 1){
                cadastrarAdm();
            } else if (opcaoAdm == 2) {
                listarAdm();
            }
        }
    }

    public static void menuVendedor(){
        Scanner sc = new Scanner(System.in);
        int opcaoVendedor = 0;
        while (opcaoVendedor !=9){
            System.out.println("⊹₊｡ꕤ˚₊⊹ MENU VENDEDOR ⊹₊｡ꕤ˚₊⊹");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Listar");
            System.out.println("(3) Fechamento do dia");
            System.out.println("(4) Registrar venda");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoVendedor = sc.nextInt();
        }
    }

    public static void cadastrarAdm(){
        Scanner sc = new Scanner(System.in);
        int opcaoCadastrarAdm = 0;
        while (opcaoCadastrarAdm != 9){
            System.out.println("ᯓ★ CADASTRAR ᯓ★");
            System.out.println("(1) Cadastrar admin");
            System.out.println("(2) Cadastrar vendedor");
            System.out.println("(3) Cadastrar cliente");
            System.out.println("(4) Cadastrar fornecedor");
            System.out.println("(5) Cadastrar produto");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoCadastrarAdm = sc.nextInt();

            if (opcaoCadastrarAdm == 1){

            } else if (opcaoCadastrarAdm == 3) {
                novoCliente();

            }
        }
    }

    public static void listarAdm(){
        Scanner sc = new Scanner(System.in);
        int opcaoListarAdm = 0;
        while (opcaoListarAdm != 9){
            System.out.println("ᯓ★ LISTAR ᯓ★");
            System.out.println("(1) Listar vendas");
            System.out.println("(2) Listar vendedor");
            System.out.println("(3) Listar cliente");
            System.out.println("(4) Listar fornecedor");
            System.out.println("(5) Listar produto");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoListarAdm = sc.nextInt();
        }
    }

    public static void cadastrarVendedor(){
        Scanner sc = new Scanner(System.in);
        int opcaoCadastrarVendedor = 0;
        while (opcaoCadastrarVendedor != 9){
            System.out.println("ᯓ★ CADASTRAR ᯓ★");
            System.out.println("(1) Cadastrar cliente");
            System.out.println("(2) Cadastrar fornecedor");
            System.out.println("(3) Cadastrar produto");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoCadastrarVendedor = sc.nextInt();
        }
    }

    public static void listarVendedor(){
        Scanner sc = new Scanner(System.in);
        int opcaoListarVendedor = 0;
        while (opcaoListarVendedor != 9){
            System.out.println("ᯓ★ LISTAR ᯓ★");
            System.out.println("(1) Listar vendas");
            System.out.println("(2) Listar vendedor");
            System.out.println("(3) Listar cliente");
            System.out.println("(4) Listar fornecedor");
            System.out.println("(5) Listar produto");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcaoListarVendedor = sc.nextInt();
        }
    }

    public static void novoCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("˚₊‧꒰ა NOVO CLIENTE ໒꒱ ‧₊˚");
        System.out.print("\uD80C\uDC83\uD83D\uDD8A Nome: ");
        String nome = sc.nextLine();
        System.out.print("\uD80C\uDC83\uD83D\uDD8A Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("♡\uD83D\uDDD2♡ Data de nascimento: ");
        System.out.print(" ☆ Dia: ");
        int dia = sc.nextInt();
        sc.nextLine();
        System.out.print("☀ Mês: ");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.print("☾ Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        String dataNascimento = dia + "-" + mes + "-" + ano;
        System.out.print("☏ Telefone: ");
        int telefone = sc.nextInt();
        sc.nextLine();
        System.out.print("\uD83C\uDC23 CPF: ");
        int cpf = sc.nextInt();
        sc.nextLine();
        System.out.print("⾕ Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("ᨒ Estado: ");
        String estado = sc.nextLine();
        System.out.print("\uD83D\uDDFA País: ");
        String pais = sc.nextLine();
        System.out.print(" ⟟ Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("\uD835\uDFDA Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("˖◛⁺⑅♡ Email: ");
        String email = sc.nextLine();
        System.out.print("\uD83D\uDDDD Senha: ");
        String senha = sc.nextLine();
    }

    public static void novoVendedor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("˚₊‧꒰ა NOVO VENDEDOR ໒꒱ ‧₊˚");
        System.out.print("\uD80C\uDC83\uD83D\uDD8A Nome: ");
        String nome = sc.nextLine();
        System.out.print("\uD80C\uDC83\uD83D\uDD8A Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("♡\uD83D\uDDD2♡ Data de nascimento: ");
        System.out.print(" ☆ Dia: ");
        int dia = sc.nextInt();
        sc.nextLine();
        System.out.print("☀ Mês: ");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.print("☾ Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        String dataNascimento = dia + "-" + mes + "-" + ano;
        System.out.print("☏ Telefone: ");
        int telefone = sc.nextInt();
        sc.nextLine();
        System.out.print("\uD83C\uDC23 CPF: ");
        int cpf = sc.nextInt();
        sc.nextLine();
        System.out.print("⾕ Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("ᨒ Estado: ");
        String estado = sc.nextLine();
        System.out.print("\uD83D\uDDFA País: ");
        String pais = sc.nextLine();
        System.out.print(" ⟟ Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("\uD835\uDFDA Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("˖◛⁺⑅♡ Email: ");
        String email = sc.nextLine();
        System.out.print("\uD83D\uDDDD Senha: ");
        String senha = sc.nextLine();
    }
}