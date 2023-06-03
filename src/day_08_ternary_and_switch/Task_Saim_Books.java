package day_08_ternary_and_switch;

public class Task_Saim_Books {
    public static void main(String[] args) {

        String genre = "COMEDY";
        int pagelength = 150;
        int profit = 300_000;
        int sequels =1;
        int countries = 50;
        String result ="";

      switch (genre){
          case "Fantasy":
              result="The " + genre + " genre usually has profits of $" + profit + " amount being sold in " +countries+ " different countries.\nThe " +genre+ " books often have " + "sequels_number squeals with each book roughly being around " +pagelength+ " pages.";
              break;
          case "Detective":
              result="The " + genre + " genre usually has profits of $" + profit + " amount being sold in " +countries+ " different countries.\nThe " +genre+ " books often have " + "sequels_number squeals with each book roughly being around " +pagelength+ " pages.";
              break;
          case "Science Fiction":
              result="The " + genre + " genre usually has profits of $" + profit + " amount being sold in " +countries+ " different countries.\nThe " +genre+ " books often have " + "sequels_number squeals with each book roughly being around " +pagelength+ " pages.";
              break;
          case "Short Story":
              result="The " + genre + " genre usually has profits of $" + profit + " amount being sold in " +countries+ " different countries.\nThe " +genre+ " books often have " + "sequels_number squeals with each book roughly being around " +pagelength+ " pages.";
              break;
          default:
              result="The book called " + genre+" does not exist.";

      }
        System.out.println(result);
    }

}
/*
Books [switch, variables]

You are an author writing a new book and want to figure out some information related to the genre

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

Use the following format to print the information:
	The $genre genre usually has profits of $profit_amount being sold in $countries_number different countries. The $genre books often have $sequels_number squeals with each book roughly being around $page_length pages.

	if the given genre is not defined print: Sorry we don't have information for the $genre genre

Hint: Use variables for the information rather than printing in each genre

    Sample data for genres:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40

 */