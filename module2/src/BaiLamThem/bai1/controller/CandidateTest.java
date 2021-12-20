package BaiLamThem.bai1.controller;
import BaiLamThem.bai1.service.CandidateService;

import java.util.Scanner;
public class CandidateTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        CandidateService candidateService=new CandidateService();
        while  (1>0)
        {
            System.out.println("1. Add new candidate");
            System.out.println("2. Get all candidate");
            System.out.println("3. Get n new candidate");
            System.out.println("4. list of candidate has sum point over 15");
            System.out.println("5. End the program");
            String choice=input.nextLine();
            switch (choice){
                case "1":
                {
                    candidateService.getAdd();
                    continue;
                }
                case "2":
                {
                    candidateService.getAll();
                    continue;
                }
                case "3":
                {
                    candidateService.getNCandidate();
                    continue;
                }
                case "4":
                {
                    candidateService.listSumPointOver15();
                    continue;
                }
                case "5":
                {
                    System.out.println("Have a nice day, bye!");
                    break;
                }
                default:
                {
                    System.out.println("Input is invalid, please re-enter your input ");
                    continue;
                }
            }
            break;

        }




    }


}
