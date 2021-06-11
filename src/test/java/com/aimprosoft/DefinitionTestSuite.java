package com.aimprosoft;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/01.SignInPage.feature"
//        "src/test/resources/02.AddingAUserToTheHRGroup.feature",
//        "src/test/resources/04.GenerationOfDocumentsForUser.feature"

})
public class DefinitionTestSuite {
}
