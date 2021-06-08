package text;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ww
 * @date 2021/1/25 - 17:01
 */
@SpringBootApplication
public class ceshi {
    public static void main(String[] args) {
        System.out.println("你好，汤姆");
        String str=test.hello("杰瑞",7);
        System.out.println(str);
        AtomicInteger aInt1 = new AtomicInteger(0);
        AtomicInteger aInt2 = new AtomicInteger(0);

        if (aInt1.equals(aInt2)) {
            System.out.println("hahah");
        }  // Noncompliant

    }

//    public enum Continent {
//
//        NORTH_AMERICA(23, 24709000),
//        // ...
//        EUROPE(50, 39310000);
//
//        public int countryCount;  // Noncompliant
//        private int landMass;
//
//        Continent(int countryCount, int landMass) {
//            // ...
//        }
//
//        public void setLandMass(int landMass) {  // Noncompliant
//            this.landMass = landMass;
//        }
//    }
}
