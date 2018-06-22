package compositePattern;

interface NeuronCluster extends Iterable<Neuron> {

    default void connectTo(NeuronCluster other){
        if (this == other) return;

        for (Neuron from : this)
            for (Neuron to : other)
            {
                from.out.add(to);
                to.in.add(from);
            }

    }

}
