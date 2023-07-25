package example

object Works {

  // Without this, compilation fails with: `Values of types example.ExampleModel and example.ExampleModel cannot be compared with == or !=`
  given CanEqual[ExampleModel, ExampleModel] = CanEqual.derived

  def compare(a: ExampleModel, b: ExampleModel): Boolean = {
    a == b
  }
}
