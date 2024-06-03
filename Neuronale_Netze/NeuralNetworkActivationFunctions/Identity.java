package Neuronale_Netze.NeuralNetworkActivationFunctions;

public class Identity implements ActivationFunction {

    @Override
    public float activation(float input) {
        return input;
    }

    
}