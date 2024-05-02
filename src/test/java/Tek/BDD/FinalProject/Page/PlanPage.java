package Tek.BDD.FinalProject.Page;

import org.openqa.selenium.By;

public class PlanPage {
    public static final By Plans = By.tagName("Plans");
    public static final By DateExpire = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/table/thead/tr/th[5]/text()");
    public static final By DateCreated = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/table/thead/tr/th[4]/text()");
    public static final By PlansAllRows = By.xpath("//*[@id='root']/div/div[3]/div/div/div/div");
}
