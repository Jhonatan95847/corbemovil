package starter;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {
    public static final Target BUTTON_INGRESAR = Target.the("Boton Ingresar").located(AppiumBy.xpath("//android.widget.TextView[@text=\"Ingresar\"]"));
    public static final Target TEXTBOX_ID =Target.the("Campo de texto ID").located(By.className("android.widget.EditText"));
    public static final Target CHECKBOX_AUTORIZATION =Target.the("Check box autorizar datos personales").located(By.className("android.widget.CheckBox"));
    public static final Target BUTTON_INGRESARAPP =Target.the("Boton ingresar").located(AppiumBy.accessibilityId(" Ingresar "));
    public static final Target BUTTON_EXPLORAR =Target.the("Boton explorar").located(AppiumBy.accessibilityId(" Explora aqui "));
    public static final Target TEXTBOX_PASSUNO =Target.the("Boton explorar").located(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]"));
    public static final Target TEXTBOX_PASSDOS =Target.the("Boton explorar").located(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]"));
    public static final Target TEXTBOX_PASSTRE =Target.the("Boton explorar").located(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
    public static final Target TEXTBOX_PASSCUA =Target.the("Boton explorar").located(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]"));

}
