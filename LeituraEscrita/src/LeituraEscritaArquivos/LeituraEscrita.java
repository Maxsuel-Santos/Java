package LeituraEscritaArquivos;

import pacote.InterfaceArquivo;
import java.awt.EventQueue;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LeituraEscrita {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                InterfaceArquivo frame = new InterfaceArquivo();
                frame.setVisible(true);
                
                /*File arquivo = new File("arquivo.txt");
       
                if (!arquivo.exists()) {
                    //cria um arquivo (vazio)

                    arquivo.createNewFile();

                }

                //caso seja um diretório, é possível listar seus arquivos e diretórios
                File[] arquivos = arquivo.listFiles();

                //escreve no arquivo
                FileWriter fw = new FileWriter(arquivo, true);

                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Linguagem de Programação I - IFBA");

                bw.write("Linguagem de Programação I - IFBA\n");
                bw.newLine();

                bw.close();

                fw.close();


                //faz a leitura do arquivo
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                //enquanto houver mais linhas
                while (br.ready()) {

                    //lê a proxima linha
                    String linha = br.readLine();

                    //faz algo com a linha
                    System.out.println(linha);
                }

                br.close();
                fr.close();*/
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        }
}
}
