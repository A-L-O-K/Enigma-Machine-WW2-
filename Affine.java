package com.company;


public class Affine {

    public static StringBuilder aff(int a, int b, int C){
        char[] alpha = new char[26];

        for (int index = 0, ascii = 65; index < 26; index++, ascii++) {

            alpha[index] = (char) ascii;
        }



StringBuilder alphas= new StringBuilder();

        String [] new_alpha= new String[26];
for(int i =0; i<26;i++){
    new_alpha[i]= String.valueOf(alpha[((a*i)+b)%26]);
    alphas.append(new_alpha[i]);
}

        return alphas;
    }


    public static void main(String[] args) {

        System.out.print(aff(6,4,1));

    }
}
