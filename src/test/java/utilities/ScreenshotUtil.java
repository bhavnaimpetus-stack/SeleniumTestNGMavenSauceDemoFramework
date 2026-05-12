package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void captureScreenshot(
            WebDriver driver,
            String testName) throws IOException {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File source =
                ts.getScreenshotAs(OutputType.FILE);

        File destination =
                new File("./screenshots/"
                        + testName + ".png");

        FileUtils.copyFile(source, destination);
    }
}