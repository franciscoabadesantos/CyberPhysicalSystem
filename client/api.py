from flask import Flask, jsonify
from client import run_client

app = Flask(__name__)

@app.route('/maintenance/<int:id>/<string:status>/<string:time>', methods=['GET'])
def get_maintenance_recommendation(id, status, time):
    runtime_hours = int(time)
    id_machine = int(id)    

    recommendations = run_client(id_machine, status, runtime_hours)
    return jsonify(recommendations)

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')