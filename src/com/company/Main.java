package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String action = "";
        int T = 22;
        if (T < 17)
        {
            action = "hit";
        }
        else if (T > 21)
        {
            action = "bust";
        }
        else
        {
            action = "stay";
        }
        System.out.println(action);
    }
}
