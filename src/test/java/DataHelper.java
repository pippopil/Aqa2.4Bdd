import lombok.Data;
import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;

        public AuthInfo(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }

    public static AuthInfo getAuthInfo() {

        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {

        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;

        public VerificationCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {

        return new VerificationCode("12345");
    }

    @Value
    public static class CardInfo {

        public CardInfo(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public String cardNumber;
    }

    public static CardInfo getFirstNumber() {
        return new CardInfo("5559000000000001");
    }

    public static CardInfo getSecondNumber() {
        return new CardInfo("5559000000000002");
    }
}
