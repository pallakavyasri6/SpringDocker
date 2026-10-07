package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String students() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Student Details</title>

            <style>
                body {
                    font-family: Arial, sans-serif;
                    margin: 40px;
                    background-color: #f5f5f5;
                }

                h1 {
                    text-align: center;
                    color: #333333;
                }

                table {
                    width: 90%;
                    margin: 20px auto;
                    border-collapse: collapse;
                    background-color: white;
                }

                th, td {
                    border: 1px solid black;
                    padding: 12px;
                    text-align: center;
                }

                th {
                    background-color: #dddddd;
                    font-weight: bold;
                }

                tr:hover {
                    background-color: #f0f0f0;
                }
            </style>
        </head>

        <body>

            <h1>Student Details</h1>

            <table>

                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Year</th>
                    <th>CGPA</th>
                </tr>

                <tr>
                    <td>101</td>
                    <td>Anjali</td>
                    <td>CSE</td>
                    <td>4</td>
                    <td>8.7</td>
                </tr>

                <tr>
                    <td>102</td>
                    <td>Bhavya</td>
                    <td>CSE</td>
                    <td>4</td>
                    <td>9.1</td>
                </tr>

                <tr>
                    <td>103</td>
                    <td>Charan</td>
                    <td>ECE</td>
                    <td>3</td>
                    <td>8.5</td>
                </tr>

                <tr>
                    <td>104</td>
                    <td>Deepika</td>
                    <td>IT</td>
                    <td>4</td>
                    <td>9.0</td>
                </tr>

                <tr>
                    <td>105</td>
                    <td>Harsha</td>
                    <td>CSE</td>
                    <td>3</td>
                    <td>8.4</td>
                </tr>

                <tr>
                    <td>106</td>
                    <td>Kavya</td>
                    <td>ECE</td>
                    <td>4</td>
                    <td>8.9</td>
                </tr>

                <tr>
                    <td>107</td>
                    <td>Manoj</td>
                    <td>IT</td>
                    <td>3</td>
                    <td>8.6</td>
                </tr>

                <tr>
                    <td>108</td>
                    <td>Navya</td>
                    <td>CSE</td>
                    <td>4</td>
                    <td>9.2</td>
                </tr>

                <tr>
                    <td>109</td>
                    <td>Rahul</td>
                    <td>ECE</td>
                    <td>3</td>
                    <td>8.3</td>
                </tr>

                <tr>
                    <td>110</td>
                    <td>Sneha</td>
                    <td>IT</td>
                    <td>4</td>
                    <td>9.3</td>
                </tr>

            </table>

        </body>
        </html>
        """;
    }
}