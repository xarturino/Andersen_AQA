package lesson_9;

public class BBC_TestCase {

    /*
    Authorization on the website
    Priority: High
    Preconditions: User isn't logged in

    Steps                                                   Expected result
    1. Go to the website www.bbc.com                            1. The Homepage of the site is displayed. The "Sign in" tab is displayed
    2. Click on tab "Sign in"                                   2. Redirect on the page account.bbc.com
    3. Enter correct email in the field "Email"                 3. The entered email is displayed
    4. Enter correct password in the field "Password"           4. The password is displayed as dots, the number of dots corresponds to the number of characters of the password
    5. Click "Enter" button                                     5. Redirect on the Homepage. Tab "Sign in" becomes a tab with login of the user


    Negative case
    Authorization with short password
    Priority: High
    Preconditions: User isn't logged in

    Steps                                                   Expected result
    1. Go to the website www.bbc.com                            1. The Homepage of the site is displayed. The "Sign in" tab is displayed
    2. Click on tab "Sign in"                                   2. Redirect on the page account.bbc.com
    3. Enter email in the field "Email"                         3. The entered email is displayed
    4. Enter the short password in the field "Password"         4. The password is displayed as dots, the message "Sorry, this password is too short. It must contain at least 8 characters."
                                                                   is displayed

    * */
}
