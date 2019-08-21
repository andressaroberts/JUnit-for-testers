package exercise14;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categories.Positive;

@RunWith(Categories.class)
@IncludeCategory(Positive.class)
@SuiteClasses({
	CategorizedTest.class
})
public class CategorySuite {
	
}
