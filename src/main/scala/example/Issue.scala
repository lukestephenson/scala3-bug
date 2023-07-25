package example

object Issue {

  def compare(a: ExampleModel, b: ExampleModel): Boolean = {
    // Demonstrates compilation failure if the given is local to a method
    // Without this `given` compilation fails with `Values of types example.ExampleModel and example.ExampleModel cannot be compared with == or !=`
    // However, with it compilation fails with `unused local definition`
    given CanEqual[ExampleModel, ExampleModel] = CanEqual.derived

    a == b
  }
}
