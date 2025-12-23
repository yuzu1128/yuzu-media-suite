<template>
  <div class="dashboard p-6 bg-slate-900 min-h-screen text-white">
    <header class="flex justify-between items-center mb-10 border-b border-slate-700 pb-4">
      <h1 class="text-3xl font-extrabold text-citrus">Global <span class="text-white">Pulse</span> Dashboard</h1>
      <div class="status flex items-center">
        <span class="w-3 h-3 bg-green-500 rounded-full mr-2 animate-pulse"></span>
        <span class="text-sm font-bold uppercase">System Live</span>
      </div>
    </header>

    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
      <!-- Real-time Throughput Chart -->
      <div class="glass-card p-4 rounded-xl border border-slate-700 bg-slate-800/50">
        <h2 class="text-lg font-bold mb-4">Stream Throughput</h2>
        <canvas id="throughputChart"></canvas>
      </div>

      <!-- Analysis Results -->
      <div class="glass-card p-4 rounded-xl border border-slate-700 bg-slate-800/50">
        <h2 class="text-lg font-bold mb-4">Anomaly Detection</h2>
        <div class="results space-y-2">
          <div v-for="log in logs" :key="log.id" class="flex justify-between text-sm p-2 bg-slate-700/30 rounded">
            <span>{{ log.timestamp }}</span>
            <span :class="log.anomaly > 0.8 ? 'text-red-500' : 'text-green-500'">Score: {{ log.anomaly }}</span>
          </div>
        </div>
      </div>

      <!-- Infrastructure Status -->
      <div class="glass-card p-4 rounded-xl border border-slate-700 bg-slate-800/50">
        <h2 class="text-lg font-bold mb-4">Node Health (K8s)</h2>
        <ul class="space-y-3">
          <li class="flex justify-between items-center">
            <span>control-api-pod-1</span>
            <span class="px-2 py-1 bg-green-900 text-green-300 text-xs rounded">Healthy</span>
          </li>
          <li class="flex justify-between items-center">
            <span>stream-proc-pod-1</span>
            <span class="px-2 py-1 bg-green-900 text-green-300 text-xs rounded">Healthy</span>
          </li>
          <li class="flex justify-between items-center">
            <span>analysis-worker-pod-1</span>
            <span class="px-2 py-1 bg-yellow-900 text-yellow-300 text-xs rounded">Busy</span>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import Chart from 'chart.js/auto';

const logs = ref([
  { id: 1, timestamp: '23:30:12', anomaly: 0.12 },
  { id: 2, timestamp: '23:30:15', anomaly: 0.85 },
  { id: 3, timestamp: '23:30:18', anomaly: 0.05 },
]);

onMounted(() => {
  const ctx = document.getElementById('throughputChart').getContext('2d');
  new Chart(ctx, {
    type: 'line',
    data: {
      labels: ['1s', '2s', '3s', '4s', '5s', '6s'],
      datasets: [{
        label: 'Events/sec',
        data: [120, 190, 300, 500, 200, 300],
        borderColor: '#FFD700',
        tension: 0.4
      }]
    },
    options: {
      responsive: true,
      plugins: { legend: { display: false } },
      scales: {
        y: { display: false },
        x: { grid: { display: false } }
      }
    }
  });
});
</script>

<style scoped>
.text-citrus { color: #FFD700; }
.glass-card { backdrop-filter: blur(8px); }
</style>
