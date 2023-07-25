package example

object CanEqualInstances {
  given CanEqual[ExampleModel, ExampleModel] = CanEqual.derived
}
