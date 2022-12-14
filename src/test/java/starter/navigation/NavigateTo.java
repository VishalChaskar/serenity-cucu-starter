package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.search.TodoListPage;

public class NavigateTo {
    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

	public static Performable thTodoListPage() {
		return Task.where("Rama opens the Todo list page",
		Open.browserOn().the(TodoListPage.class));
		
	}
	
}
