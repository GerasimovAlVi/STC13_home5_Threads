package ru.innopolis.home_work_4;

public class Main {
    public static void main(String[] args) {
        /*ClassGenerateText classGenerateText = new ClassGenerateText();
        String[] words = new String[]{"aaaaaaaaaa", "bbbbbbbbbb", "cccccccccc"};
        classGenerateText.getFile("d://", 5, 50, words, 1);*/

        ClassGererateNewTextFile classGererateNewTextFile = new ClassGererateNewTextFile();
        String[] strWord = {"bbbbbbbbbb", "cccccccccc"};
        String[] strPath = {"d://file1.txt","d://file2.txt","d://file3.txt","d://file4.txt","d://file5.txt"};
        classGererateNewTextFile.getOccurencies(strPath, strWord, "d://Itog.txt", 2);
    }
}
