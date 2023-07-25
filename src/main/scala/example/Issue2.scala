package example

// Without this import compilation fails with `Values of types example.ExampleModel and example.ExampleModel cannot be compared with == or !=`
// However, with it compilation fails with `unused import`
import example.CanEqualInstances.given

object Issue2 {

  def compare(a: ExampleModel, b: ExampleModel): Boolean = {
    a == b
  }
}
