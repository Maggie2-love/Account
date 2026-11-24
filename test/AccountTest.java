import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest{
    @Test
    public void testThatAccountBalanceIsZero(){

       AccountApp account = new AccountApp();
        assertEquals(0, account.getAccount());
    }
    //given
    @Test
    public void testThatAccountBalanceIs5k(){
        AccountApp account = new AccountApp();
        account.depositAccount(5_000);
        assertEquals( 5_000, account.getAccount() );
    }
    @Test
    public void testThat2kCanBeWithdrawn(){
        AccountApp account = new AccountApp();
        account.depositAccount(5_000);
        account.withdraw(2_000);
        assertEquals(3_000, account.getAccount());
    }
@Test
public void testThatPasswordIsCorrect(){
        AccountApp account = new AccountApp();
        assertTrue(account.checkPassword("Mag24"));

}
@Test
    public void testThatPasswordIsInCorrect(){
        AccountApp account = new AccountApp();
        assertFalse(account.checkPassword(String.valueOf(1234)));
}
@Test
    public void testThatMoneyCanBeTransferred(){
        AccountApp account1 = new AccountApp();
        AccountApp account2 = new AccountApp();

        account1.depositAccount(5_000);
        account2.depositAccount(2_000);

        account1.transferMoney(account2, 1_000);
        assertEquals(4_000, account1.getAccount());
        assertEquals(3_000, account2.getAccount());


}
    @Test
    public void testThatMoneyCanBeWithdrawnWithCorrectPin() {
        AccountApp account = new AccountApp();
        account.depositAccount(5_000);

        account.withdraw(2_000, "Mag24");

        assertEquals(3_000, account.getAccount());
    }

    @Test
    public void testThatMoneyCannotBeWithdrawnWithoutPin() {
        AccountApp account = new AccountApp();
        account.depositAccount(5_000);

        account.withdraw(2_000, "");

        assertEquals(5_000, account.getAccount());
    }

    @Test
    public void testThatMoneyCannotBeWithdrawnWithWrongPin() {
        AccountApp account = new AccountApp();
        account.depositAccount(5_000);

        account.withdraw(2_000, "1234");

        assertEquals(5_000, account.getAccount());
    }
}

