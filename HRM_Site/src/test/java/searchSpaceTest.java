import org.testng.annotations.Test;

public class searchSpaceTest extends baseTest
{

    @Test
    public void Search()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        new CandidateDetails(driver).candidateDeatilsInsert("Aditya","Nitin","Gahile","xyz@gmail.com");
        new RecruitmentPage(driver).clickRecruitment();
        new SearchSpace(driver).SearchCandidate("Aditya Nitin Gahile");

// there is a bug in OrangeHRM site at the search side of then when we enter name manually we get invalid message but only get seacherd if we select name from given suggestion
    }
}
