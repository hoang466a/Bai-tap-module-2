package BaiLamThem.bai1.service;
import BaiLamThem.bai1.model.Candidate;

import java.util.Scanner;
public class CandidateService implements iCandidate {
    private Candidate[] candidates=new Candidate[100];
    private static int number=0;
    private static Scanner input=new Scanner(System.in);

    @Override
    public void getAdd() {
        if(number<candidates.length) {
            System.out.println("Input the candidate id:");
            String candidateId = input.nextLine();
            while (!(candidateId.matches("^[1-9][0-9][0-9][0-9]$"))) {
                System.out.println("Input is invalid!");
                System.out.println("Input the candidate id:");
                candidateId = input.nextLine();
            }

            System.out.println("Input the candidate name:");
            String candidateName = input.nextLine();

            System.out.println("Input the candidate date of birth:");
            String candidateBirth = input.nextLine();
            System.out.println("Input the candidate math point:");
            double candidateMathpoint = Double.parseDouble(input.nextLine());

            System.out.println("Input the candidate literature point:");
            double candidateLiteraturepoint = Double.parseDouble(input.nextLine());

            System.out.println("Input the candidate english point:");
            double candidateEnglishpoint = Double.parseDouble(input.nextLine());
            Candidate candidate=new Candidate(candidateId,candidateName,candidateBirth,candidateMathpoint,candidateLiteraturepoint,candidateEnglishpoint);
            candidates[number]=candidate;
            number++;
        }
        else{
            System.out.println("The list has full!");
        }



    }

    @Override
    public void getAll() {
        for (int i=0;i<number;i++)
        {
            System.out.println(candidates[i]);
        }
    }

    @Override
    public void getNCandidate() {
        System.out.println("Input the number of candidate want to add: ");
        int add=input.nextInt();
        if(add+number>candidates.length)
        {
            System.out.println("The list has full!");
        }
        else
        {
            for (int i=0;i<add;i++)
            {
                getAdd();
            }
        }

    }

    @Override
    public void listSumPointOver15() {
        for (int i=0;i<number;i++)
        {
            if(candidates[i].pointSum()>15)
            {
                System.out.println(candidates[i]);
            }
        }



    }
}
