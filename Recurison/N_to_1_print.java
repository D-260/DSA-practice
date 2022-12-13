public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }

    // concept
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }
// N to 1
// call visualization: f(5) -> 5 print and thus empty it from where f(5) is called, i. e n-1 at the end, now it's in wait state -> f(4) -> 4-> f(3) -> 3 and so on.
//This calling and printing will cease when n == 0 and will be returned as it is : 5 4 3 2 1.
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
// 1 to N
// call visualization: f(5)-> f(4) -> f(3) -> .... and so on. 
//This calling will cease when n == 0 and will be returned as it is : 1 2 3 4 5. printing is done after calling so the last call is printed first
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
// both 1 to N and N to 1
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
