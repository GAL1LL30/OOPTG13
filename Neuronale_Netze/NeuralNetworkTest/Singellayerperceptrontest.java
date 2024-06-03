package Neuronale_Netze.NeuralNetworkTest;

import Neuronale_Netze.NeuralNetwork.InputNeuron;
import Neuronale_Netze.NeuralNetwork.NeuronalNetwork;
import Neuronale_Netze.NeuralNetwork.WorkingNeuron;

public class Singellayerperceptrontest {
    public static void main(String[] args) {
        NeuronalNetwork nn = new NeuronalNetwork();

        InputNeuron i1 = nn.createNewInput();
        InputNeuron i2 = nn.createNewInput();
        InputNeuron i3 = nn.createNewInput();
        InputNeuron i4 = nn.createNewInput();

        WorkingNeuron o1 = nn.createnewOutput();
        nn.createFullMesh(3, -1, 2, 0);

        i1.setValue(1);
        i2.setValue(2);
        i3.setValue(3);
        i3.setValue(4);
    
        System.out.println(o1.getvalue());
    }
}
