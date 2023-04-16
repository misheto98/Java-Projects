import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        FirstLine(n);
        Top(n);
        Mid(n);
        Bot(n);
    }

    public static void FirstLine(int n){
        int i = 0;
        int dots = 0;
        int underline = n * 2;

        while (i < dots) {
            System.out.println(".");
            i++;
        }
        i = 0;
        while(i<=underline){
            System.out.print("_");
            i++;
        }
        System.out.print("\\\\");
        i = 0;
        while(i<dots) {
            System.out.print(".");
            i++;
        }
        dots--;
        underline+=2;
    }

    public static  void Top(int n){
        int i = 0;
        int dots = n;
        int rows = 0;
        int underline = 2*n-1;

        while(rows<n){
            while(i < dots){
                System.out.print(".");
                i++;
            }
            System.out.print("\\\\");
            i = 0;
            while(i < dots){
                System.out.println();
                rows++;
                i = 0;
                dots--;
                underline+=2;
            }
        }

    }

    public static void Mid(int n){
        int i = 0;
        int rows = 0;
        int underline = 2*n-1;
        while(rows< n){
            while(i<underline){
                i++;
            }
            i=0;
            rows++;
            underline+=2;
        }

    }

    public static void Bot(int n){
        int i = 0 ;
        int dots = 0;
        int rows = 0;
        int underline = 2*n - 1;

        while(rows < n ){
            while (i<underline){
                i++;
            }
            i = 0;
            rows++;
            underline+=2;
        }
        i = 0;
        rows = 0;
        while(rows<n){
            while(i < dots){
                System.out.print(".");
                i++;
            }
            System.out.print("\\\\");
            i = 0;
            while(i<underline){
                System.out.print("_");
                i++;
            }
            System.out.print("%%");
            i = 0;
            while(i< underline){
                System.out.print(".");
                i++;
            }
            System.out.println();
            rows++;
            i = 0;
            dots++;
            underline -=2;
        }

    }
}
