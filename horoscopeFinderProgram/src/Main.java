import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int monht, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Which month were you born in : ");
        monht = input.nextInt();

        System.out.print("what day were you born : ");
        day = input.nextInt();

        if (monht == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Capricorn";
                } else {
                    horoscope = "Aquarius";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    horoscope = "Aquarius";
                } else {
                    horoscope = "Pisces";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Pisces";
                } else {
                    horoscope = "Aries";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "Aries";
                } else {
                    horoscope = "Taurus";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Taurus";
                } else {
                    horoscope = "Gemini";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    horoscope = "Gemini";
                } else {
                    horoscope = "Cancer";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Cancer";
                } else {
                    horoscope = "Leo";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Leo";
                } else {
                    horoscope = "Virgo";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    horoscope = "Virgo";
                } else {
                    horoscope = "Libra";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Libra";
                } else {
                    horoscope = "Scorpio";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "Scorpio";
                } else {
                    horoscope = "Sagittarius";
                }
            } else {
                isError = true;
            }
        }

        if (monht == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Sagittarius";
                } else {
                    horoscope = "Capricorn";
                }
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("You entered incorrectly, please try again.");
        } else {
            System.out.println("Your horoscope : " + horoscope);
        }
    }
}