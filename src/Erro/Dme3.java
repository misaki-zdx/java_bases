package Erro;

/**
 * Author Misaki
 * Create By 2018/3/14
 */
class NoIpException extends Exception {
    NoIpException() {
    }

    ;

    NoIpException(String message) {
        super(message);
    }

}

public class Dme3 {
    public static void main(String[] args) throws NoIpException {

        System.out.println();
        String ip = "192.168.10.252";
        ip = null;
            Lb(ip);


    }

    /*
     *
     * 凌波教学
     */
    public static void Lb(String ip) throws NoIpException {
        if (ip == null) {
            // throw new Exception("没插网线吧，小白");
            throw new NoIpException("没插网线吧，小白");
        }

        System.out.println("醒醒了，开始上课了。");
    }

}
