package br.com.fiap.banco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    public static void main(String[] args) {
        String nomeArquivo = "dados.txt";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "//" + nomeArquivo;

        // Utilizando a interface list para criar uma lista de strings
        List<String> dadosConta = new ArrayList<>();
        dadosConta.add("\nDADOS DA CONTA");
        dadosConta.add("Nome: Jaqueline");
        dadosConta.add("Data de nascimento: 13/11/2003");
        dadosConta.add("CPF: ***.***.***-**");
        dadosConta.add("Numero de conta: 23456");
        dadosConta.add("Numero de agencia: 45678");

        // Gravar dados no arquivo
        gravarDados(nomeArquivo, caminho, dadosConta);
        // Ler dados do arquivo
        lerDados(caminho);
        // Informações sobre o arquivo
        File arquivo = new File(caminho);

        if(arquivo.exists()) {
            System.out.println("\nINFORMAÇÕES SOBRE O ARQUIVO");
            System.out.println("O arquivo existe!" +
                    "\nPode ser lido: " + arquivo.canRead() +
                    "\nPode ser gravado: " + arquivo.canWrite() +
                    "\nTamanho: " + arquivo.length() +
                    "\nCaminho: " + arquivo.getPath());
        } else {
            // Se o arquivo não existir, neste bloco será criado
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado!");
                } else {
                    System.out.println("Ocorreu um erro na criação do arquivo!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Informações sobre o diretótio
        File fileDiretorio = new File(diretorio);

        if(fileDiretorio.exists()) {
            System.out.println("O diretorio existe!");
        } else {
            // Se o diretorio não existir, neste bloco será criado
            if (fileDiretorio.mkdir()) {
                System.out.println("Diretorio criado!");
            } else {
                System.out.println("Ocorreu um erro na criação do diretorio!");
            }
        }
    }

    private static void gravarDados(String nomeArquivo, String caminho, List<String> dadosConta) {
        // Iniciando variáveis, FileWriter e PrintWriter são classes que permitirão a escrita no arquivo;
        FileWriter stream;
        PrintWriter print;

        // Cuidando de possíveis erros
        try {
            // Instânciando e atribuindo valores às variaveis iniciadas
            stream = new FileWriter(caminho);
            print = new PrintWriter(stream);

            //forEach
            for (String line: dadosConta) {
                // Metodo println() escreve uma linha no arquivo
                print.println(line);
            }

            // Fechando o arquivo
            stream.close();
            print.close();

            System.out.println("O arquivo " + nomeArquivo + " foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerDados(String caminho) {
        try {
            // Abrindo o arquivo
            FileReader stream = new FileReader(caminho);

            // BufferReader possui o método readLine(),
            // lê uma linha do arquivo e retorna uma string com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            // Lendo uma linha do arquivo
            String line = reader.readLine();

            // Enquanto line for diferente de null
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
