package io.kager.shapes;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.kager.shapes.Test_Rechthoek;

@RunWith(Suite.class)
@SuiteClasses({Test_Rechthoek.class, Test_Vierkant_Before_Refactor.class})
public class Test_Figuren {

}
