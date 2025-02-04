package day01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class P01_Notasyon {

    @Test
    public void testC(){
        System.out.println("C testi çalıştı ");
    }

    @Test
    public void testA(){
        System.out.println("A testi çalıştı");
    }

    @Test @Disabled //@Disabled testin çalışmaması için kullanılır.JUnit'in seleniumdan entemel farkı bu notasyonlardır(@Test, @Disabled.....)
    public void testB(){
        System.out.println("B testi çalıştı");
    }


}
