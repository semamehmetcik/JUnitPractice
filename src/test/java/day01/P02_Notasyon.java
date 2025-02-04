package day01;

import org.junit.jupiter.api.*;

public class P02_Notasyon {

    @BeforeAll
    public static void  setUp(){
        System.out.println("Test İşlemi başlatılıyor");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("Tüm Test işlemi bitirildi");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Sıradaki test Çalıştırılacak");
    }
    @AfterEach
    public void afterEachTest(){
        System.out.println("Var ise bir sonraki test çalıştırılacak");
    }

    @Test
    public void sema(){
        System.out.println("Sema Mehmetçik\nQA Engineer");
    }

    @Test
    public void erdem(){
        System.out.println("Erdem Mehmet Bostancı\nHealth Technician");
    }

    @Test
    public void mehmetçik(){
        System.out.println("Sema Mehmetçik\nFull Stack Developer");

        /**
         * @BeforeAll  //Hepsinden önce bunu çalıştırır
         * @AfterAll // Hepsinden sonra bunu çalıştırır
         * @BeforeEach  // Herbir testten önce çalışır
         * @AfterEach  // Herbir testtten sonra çalıştırılır
         */
    }
}




