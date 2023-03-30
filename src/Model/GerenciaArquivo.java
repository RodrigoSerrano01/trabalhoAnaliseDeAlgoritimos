package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class GerenciaArquivo {




    public static void salvaArquivo(List<Integer> lista, int tamanho) throws IOException {
        OutputStream arq = new FileOutputStream(tamanho+".txt");
        Writer wr = new OutputStreamWriter(arq);

        BufferedWriter br = new BufferedWriter(wr);

        lista.forEach(a-> {
            try {
                br.write(a.toString()+":");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        br.close();
    }

    public static List<Integer> leArquivo(Integer tamanho) throws IOException {
        FileReader fr = new FileReader(tamanho+".txt");
        List<String[]> listaAux = new ArrayList<>();
        List<Integer> listaInteger = new ArrayList<>() ;
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null){
            listaAux.add(str.split(":"));
        }
        System.out.println("!!!!!!!!!!!!!!!!!");
        for (String a[]: listaAux ) {
            listaInteger.add(Integer.parseInt(Arrays.toString(a)));
        }
        return listaInteger;
    }
}
