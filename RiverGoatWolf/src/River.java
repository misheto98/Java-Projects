public class River {

        public static void main(String[] args) {
            int L = 7;
            int V = 1;
            int K = 2;
            int Z = 3;
            boolean ERR = false;
            int counter = 0;

            while (V == 1 || K == 2 || Z == 3)
            {
                for (int i = 1; i <= 3; i++)
                {

                    System.out.println(">>> Опит с : " + i + "-обект :: ");

                    if (L != 70)
                    {
                        L = L * 10;
                    }

                    if (i == 1 && V != 10)
                    {
                        V = V * 10;
                        System.out.println("Прехвърлям ВЪЛК");
                    }

                    if (i == 2 && K != 20)
                    {
                        K = K * 10;
                        System.out.println("Прехвърлям КОЗА");
                    }

                    if (i == 3 && Z != 30)
                    {
                        Z = Z * 10;
                        System.out.println("Прехвърлям ЗЕЛКА");
                    }

                    //проверка за конфликт на ЛЕВИЯ браг
                    if ( (V == 1 && K == 2 && L == 70) || (K == 2 && Z == 3 && L == 70) )
                    {
                        ERR = true;

                        if (L != 7)
                        {
                            L = L / 10;
                        }

                        if (V == 10 && i == 1)
                        {
                            V = V / 10;
                        }

                        if (K == 20 && i == 2)
                        {
                            K = K / 10;
                        }

                        if (Z == 30 && i == 3)
                        {
                            Z = Z / 10;
                        }

                        System.out.println("Грешен ход !");
                    }

                    //проверка за конфликт на ДЕСЕН браг
                    if ((V == 10 && K == 20 && L == 7) || (K == 20 && Z == 30 && L == 7))
                    {
                        ERR = true;


                        L = L / 10;


                        if (V == 10 && i == 1)
                        {
                            V = V / 10;
                        }

                        if (K == 20 && i == 2)
                        {
                            K = K / 10;
                        }

                        if (Z == 30 && i == 3)
                        {
                            Z = Z / 10;
                        }

                        System.out.println("Грешен ход !");
                    }

                    if (ERR == false)
                    {
                        counter++;
                        L = L / 10;
                        System.out.printf("Вукът е : %d",V);
                        System.out.printf("Koзата е : %d",K);
                        System.out.printf("Зелката е : %d",Z);
                        System.out.printf("Лодката е : %d",L);
                        System.out.println();
                    }
                }
            }
        }
    }



