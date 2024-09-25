package Tests;

import Pages.DragDropPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropTests extends BaseTests{
    @Test
    public void textBoxesSwapped() throws InterruptedException {
        var dragDrop= home.clickDragDrop();
        dragDrop.dragDropBox(1,2);
        String expectedResult="B";
        String actualResult=dragDrop.getBoxText(1);
        Assert.assertEquals(expectedResult,actualResult,"Error Swap Failed");
    }
}
