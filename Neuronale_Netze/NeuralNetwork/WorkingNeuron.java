package Neuronale_Netze.NeuralNetwork;

import java.util.ArrayList;
import java.util.List;

import Neuronale_Netze.NeuralNetworkActivationFunctions.ActivationFunction;

public class WorkingNeuron extends Neuron{

    private List<Connection> connections = new ArrayList<>();
    private ActivationFunction activationFunction;

    @Override
    public float getvalue() {
        float sum = 0;

        for(Connection c : connections){
            sum += c.getValue();
        }

        return activationFunction.activation(sum);
    }
    
    public void addConnection(Connection c){
        connections.add(c);
    }

}
