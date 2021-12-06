how to start the service:


### Install Miniconda

**This step is only necessary if you don't have conda installed**:
- download the Miniconda installer for your OS [here](https://docs.conda.io/en/latest/miniconda.html)
- run the installer following the instructions
  [here](https://conda.io/projects/conda/en/latest/user-guide/install/index.html#regular-installation)
  depending on your OS.

### Create conda environment

```sh
# Create a conda environment with the required packages for this notebook:
conda env create -f environment.yml
# Activate your conda environment
conda activate collect-monitor-service
```