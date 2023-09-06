# Land Use Classification System

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Java Version](https://img.shields.io/badge/java-19-blue)
![Python 3 Version](https://img.shields.io/badge/python-3)

The Land Use Classification System is a Java 19-based design and implemented as a Python 3 web application, designed to classify different types of land use based on input data. It utilizes various technologies such as Cucumber, Selenium, JUnit, and Maven for testing and development. It is deployed using StreamLit.

## Overview
This project was developed during my masters course on Software Engineering at BIT Mesra. This was an attempt to solve a Smart India Hackathon project of the same name, but using design modelling via testing and development tools, and then developing the complete web application. Land use classification is an important task in urban planning, environmental management, and various other fields. This system provides a convenient way to classify land use based on different attributes and criteria. It uses the EuroSAT data and utilizes ResNet50 as a deep learning model to classify the satellite images.

## Key Features
- **ResNet50 Model:** We have implemented ResNet50 for precise satellite image classification.
- **Interactive Dashboard:** The project is deployed using Streamlit, providing a user-friendly and interactive interface.
- **EuroSAT Data:** Utilize EuroSAT satellite data for training and testing the model.
- **Real-time Updates:** The model can be updated with the latest data for up-to-the-minute trend analysis.
- **Visualization:** Visualize land usage trends through interactive charts and graphs.
- **Cucumber:** We have used Cucumber for behavior-driven development.
- **Selenium:** Used Selenium for automated user interface testing.
- **JUnit:** Used JUnit for unit testing.
- **Maven:** Used Maven for build and dependency management.

## Deployment
You can access the live deployment of this project by clicking [here](https://landuse-classification-by-dewesh.streamlit.app/).

## Getting Started
To get started with this project locally, follow these steps:

1. Clone this repository:
   ```bash
   git clone https://github.com/dewesh-chopra/Land-Use-Classification-System.git

2. Install the required dependencies:
   ```bash
   pip install -r requirements.txt

3. Run the Streamlit app:
   ```bash
   streamlit run app.py

4. Open your web browser and go to http://localhost:8501 to access the application.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request if you'd like to make improvements or fix any issues.

## License
This project will soon be licensed under the MIT License.

## Connect with me
Feel free to reach out to me at [https://www.linkedin.com/in/dewesh-chopra/] for any questions or feedback.
