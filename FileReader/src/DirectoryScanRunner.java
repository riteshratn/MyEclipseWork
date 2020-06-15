import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
	Path currentDirectory =Paths.get(".");
	
			//Files.list(currentDirectory).forEach(System.out::println);
		
	Predicate<? super Path> predicate=path-> String.valueOf(path).contains(".java");
	Files.walk(currentDirectory,4)
	.filter(predicate)
	.forEach(System.out::println);
	
	BiPredicate<Path,BasicFileAttributes>matcher=(path,attributes)->String.valueOf(path).contains(".java");
	Files.find(currentDirectory, 4, matcher).forEach(System.out::println);
	}

}
